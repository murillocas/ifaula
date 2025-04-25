package com.example.primeiroapp;

import android.app.Application;

public class MeuApp extends Application {
    private UsuarioViewModel usuarioViewModel;

    @Override
    public void onCreate() {
        super.onCreate();
        usuarioViewModel = new UsuarioViewModel(this);
    }

    public UsuarioViewModel getUsuarioViewModel() {
        return usuarioViewModel;
    }
}