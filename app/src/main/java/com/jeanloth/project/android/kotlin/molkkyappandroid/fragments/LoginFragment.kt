package com.jeanloth.project.android.kotlin.molkkyappandroid.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.jeanloth.project.android.kotlin.molkkyappandroid.R
import kotlinx.android.synthetic.main.login_fragment.*
import org.koin.android.viewmodel.ext.android.viewModel
import splitties.views.onClick

class LoginFragment : Fragment() {

    val loginVM : LoginViewModel by viewModel()

    private val TAG = "Login Fragment"

    companion object {
        fun newInstance() = LoginFragment()
    }

    private lateinit var viewModel: LoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.login_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loginVM.getTeamLiveData.observe(viewLifecycleOwner, Observer {
            if(it?.teamId != 0)  goToHomePage()
            Log.d(TAG, "Team observed : $it")
        })

        btn_connexion.onClick{
            Log.d(TAG, "btn_connexion clickd")
            //loginVM.connectUser(edt_identifier.text.toString())
            loginVM.testConnectUser()
        }
    }

    private fun goToHomePage() {
        Log.d(TAG, "Go to home page")
    }

}