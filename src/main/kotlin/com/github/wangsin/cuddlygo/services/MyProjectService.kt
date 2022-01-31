package com.github.wangsin.cuddlygo.services

import com.intellij.openapi.project.Project
import com.github.wangsin.cuddlygo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
