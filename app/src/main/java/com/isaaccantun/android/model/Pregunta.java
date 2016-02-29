package com.isaaccantun.android.model;

/**
 * Created by ISAAC on 26/02/2016.
 */
public class Pregunta {
    private int mIdResTexto;
    private boolean mRespuestaVerdadera;

    public Pregunta(int mIdResTexto, boolean mRespuestaVerdadera) {
        this.mIdResTexto = mIdResTexto;
        this.mRespuestaVerdadera = mRespuestaVerdadera;
    }

    public int getmIdResTexto() {
        return mIdResTexto;
    }

    public void setmIdResTexto(int mIdResTexto) {
        this.mIdResTexto = mIdResTexto;
    }

    public boolean ismRespuestaVerdadera() {
        return mRespuestaVerdadera;
    }

    public void setmRespuestaVerdadera(boolean mRespuestaVerdadera) {
        this.mRespuestaVerdadera = mRespuestaVerdadera;
    }
}
