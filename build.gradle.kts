import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
	val kotlinVersion = "1.1.2"
	val springBootVersion = "2.0.0.BUILD-SNAPSHOT"
	repositories {
		mavenCentral()
		maven { url = uri("https://repo.spring.io/snapshot") }
		maven { url = uri("https://repo.spring.io/milestone") }
	}
	dependencies {
		classpath("org.springframework.boot:spring-boot-gradle-plugin:$springBootVersion")
		classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
		classpath("org.jetbrains.kotlin:kotlin-allopen:$kotlinVersion")
	}
}

apply {
	plugin("kotlin")
	plugin("kotlin-spring")
	plugin("org.springframework.boot")
	plugin("io.spring.dependency-management")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		kotlinOptions.jvmTarget = "1.8"
	}
}

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/snapshot") }
	maven { url = uri("https://repo.spring.io/milestone") }
}

val kotlinVersion = "1.1.2"

dependencies {
	compile("org.springframework.boot:spring-boot-starter-web")
	compile("org.jetbrains.kotlin:kotlin-stdlib-jre8:$kotlinVersion")
	compile("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
	testCompile("org.springframework.boot:spring-boot-starter-test")
}
