package com.company.recyclerview;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

public class ElementoViewHolder extends RecyclerView.ViewHolder{
    MutableLiveData<Elemento> elementoSeleccionado = new MutableLiveData<>();

    public ElementoViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    void seleccionar(Elemento elemento){
        elementoSeleccionado.setValue(elemento);
    }

    MutableLiveData<Elemento> seleccionado(){
        return elementoSeleccionado;
    }
}
