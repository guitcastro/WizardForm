package br.com.leandroferreira.wizard_forms.contract

abstract class UpdatableWizardPageViewModel<K> : WizardPageViewModel<K>(){
    abstract fun getOnStateChangeListener() : OnStateChangeListener<K>
}