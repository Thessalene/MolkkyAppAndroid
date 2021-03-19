package com.jeanloth.project.android.kotlin.molkkyappandroid.fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jeanloth.project.android.kotlin.domain.usesCases.GetTeamUseCase
import com.jeanloth.project.android.kotlin.domain_model.Team
import com.jeanloth.project.android.kotlin.data.externalData.apis.TeamService

class LoginViewModel (
    val getTeamUseCases : GetTeamUseCase,
    val teamService : TeamService
) : ViewModel() {

    private val getTeamMutableLiveData : MutableLiveData<Team?> = MutableLiveData(null)
    val getTeamLiveData : LiveData<Team?> = getTeamMutableLiveData

    fun connectUser(identifier : String){
        getTeamMutableLiveData.postValue(getTeamUseCases.getTeam(identifier))
    }

    fun testConnectUser(){
        teamService.connectTeam()
        //print("RESULT : $result")
    }
}