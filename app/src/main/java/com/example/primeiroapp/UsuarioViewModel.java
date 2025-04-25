package com.example.primeiroapp;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class UsuarioViewModel extends AndroidViewModel {

    private final List<Usuario> listaUsuarios = new ArrayList<>();

    public UsuarioViewModel(Application application) {
        super(application);
    }

    public void adicionarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public List<Usuario> getUsuarios() {
        return listaUsuarios;
    }
}
