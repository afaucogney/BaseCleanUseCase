package fr.afaucogney.mobile.android.base.cleanusecase

interface BaseUseCaseOut<out OUT> : BaseUseCase {
     fun execute(): OUT
}
