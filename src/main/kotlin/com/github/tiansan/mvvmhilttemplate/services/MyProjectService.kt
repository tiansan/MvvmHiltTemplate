package com.github.tiansan.mvvmhilttemplate.services

import com.github.tiansan.mvvmhilttemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
