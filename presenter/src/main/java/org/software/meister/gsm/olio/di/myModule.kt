package org.software.meister.gsm.olio.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import org.software.meister.gsm.olio.viewmodel.activity.*
import org.software.meister.gsm.olio.viewmodel.fragment.*
import org.software.meister.gsm.olio.viewmodel.fragment.stack.*

val myModule = module{
    viewModel { SplashViewModel() }
    viewModel { RegisterViewModel() }
    viewModel { LoginViewModel() }
    viewModel { FirstLoginViewModel() }
    viewModel { MainViewModel() }
    viewModel { GuideViewModel() }
    viewModel { AwardViewModel() }
    viewModel { LicenseViewModel() }
    viewModel { SkillViewModel() }
    viewModel { StackProjectViewModel() }
    viewModel { Guide1ViewModel() }
    viewModel { Guide2ViewModel() }
    viewModel { Guide3ViewModel() }
    viewModel { OlioViewModel() }
    viewModel { PageViewModel() }
    viewModel { PortfolioViewModel() }
    viewModel { ProjectPageViewModel() }
    viewModel { ProjectVIewModel() }
}