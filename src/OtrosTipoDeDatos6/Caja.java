package OtrosTipoDeDatos6;

public class Caja <T>{
    T elemento;

    Caja(T elemento){
        this.elemento = elemento;
    }

    T obtenerObjeto(){
        return elemento;
    }

    <V> boolean pertenecerElContenidoALaMismaClase(V otroObjeto){
        return elemento.getClass() == otroObjeto.getClass();
    }
}
