package com.github.lzj960515.kquniversalgenerator.services

import com.intellij.openapi.project.Project
import com.github.lzj960515.kquniversalgenerator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
