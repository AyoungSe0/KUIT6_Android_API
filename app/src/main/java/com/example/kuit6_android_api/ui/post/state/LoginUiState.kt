package com.example.kuit6_android_api.ui.post.state

data class LoginUiState(
    val id: String = "",
    val password: String = "",
    val isAutoLogin: Boolean = false, // data store에 저장하고 NavGraph 통해서(로그인 스크린 진입할 때, 로그인 스크린 뷰모델 생성될 때)
    val token: String = "",
)
