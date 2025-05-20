package com.example.primeiroapp.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;

import com.example.primeiroapp.model.Usuario;

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
