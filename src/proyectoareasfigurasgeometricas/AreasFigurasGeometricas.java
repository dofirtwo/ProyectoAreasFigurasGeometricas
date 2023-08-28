package proyectoareasfigurasgeometricas;

/**
 *
 * @author USUARIO
 */
public class AreasFigurasGeometricas {

    public double AreaCiculo(double radio) {
        return Math.PI *(radio*radio);
    }
    
    public double AreaCuadrado(double lado){
        return lado*lado;
    }
    
    public double AreaTriangulo(double base, double altura){
        return (base*altura)/2;
       
    }

}
