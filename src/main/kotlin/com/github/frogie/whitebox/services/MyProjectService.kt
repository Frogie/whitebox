package com.github.frogie.whitebox.services

import com.intellij.openapi.project.Project
import com.github.frogie.whitebox.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
