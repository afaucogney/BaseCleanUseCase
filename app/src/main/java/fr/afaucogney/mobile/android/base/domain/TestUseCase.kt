package fr.afaucogney.mobile.android.base.domain

import fr.afaucogney.mobile.android.base.cleanusecase.BaseUseCaseInOut

class TestUseCase : BaseUseCaseInOut<String, Int> {
    override fun execute(parameter: String): Int {
        return when (parameter) {
            "YES" -> 10
            "NO" -> 0
            else -> -1
        }
    }
}