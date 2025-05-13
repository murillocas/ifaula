package com.example.primeiroapp.RecyclerViewGroup;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.primeiroapp.R;

public class UsuarioViewHolder extends RecyclerView.ViewHolder {
    TextView textViewNome, textViewIdade;

    public UsuarioViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewNome = itemView.findViewById(R.id.textViewNome);
        textViewIdade = itemView.findViewById(R.id.textViewIdade);
    }

}