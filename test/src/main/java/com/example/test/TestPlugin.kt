package com.example.test
import org.gradle.api.Plugin
import org.gradle.api.Project

class TestPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        println("\n====> hello!!")
    }

    companion object {}
}