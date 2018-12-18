package fr.afaucogney.mobile.android.base.cleanusecase

interface BaseUseCaseInOut<in IN, out OUT> : BaseUseCase {
    fun execute(parameter: IN): OUT
}
