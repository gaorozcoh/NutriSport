package com.stevdza_san.nutrisport

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform