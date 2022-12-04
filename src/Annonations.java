import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Annonations {

    //Bir anatasyon oluşturdum ve target özelliği ile kısıtlama getirdim. Sadece metodlarda kullanılsın diye.

    @Target(ElementType.METHOD) 
    public @interface Annonation1{

    }
    //hazırladığım anatasyonu bir metodun üzerinde kullandım.
    @Annonation1
    public void method1(){

    }

}
