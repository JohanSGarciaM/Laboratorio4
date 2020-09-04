package hangman.model;

/**import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;*/
import org.junit.Assert;
import org.junit.Test;

public class GameScoreTest{
    /**Clase de equivalencia 1 OriginalScore
        penalizar unicamente con 10 unidades por letra incorrecta
        
        limite - frontera
        en 100 unidades
        en 0 unidades
        numero de desaciertos*10 < numero score
     */
    @Test
    public void validateOriginalScore1(){
        OriginalScore originalScore = new OriginalScore();
        int score = originalScore.calculateScore(10,1);
        Assert.assertEquals(score,90);
    }
    /**Clase de equivalencia 1 OriginalScore
        penalizar unicamente con 10 unidades por letra incorrecta
    
        limite - frontera
        numero desaciertos*10 = num de score
     */
     @Test
    public void validateOriginalScore2(){
        OriginalScore originalScore = new OriginalScore();
        int score = originalScore.calculateScore(10,10);
        Assert.assertEquals(score,0);
    }

    /**Clase de equivalencia 1 OriginalScore
        penalizar unicamente con 10 unidades por letra incorrecta
    
        limite - frontera
        numero desaciertos*10 > num de score
     */
     @Test
    public void validateOriginalScore3(){
        OriginalScore originalScore = new OriginalScore();
        int score = originalScore.calculateScore(10,11);
        Assert.assertEquals(score,0);
    }




    /**Clase de equivalencia 2 BonusScore
        penalizar unicamente con 5 unidades por letra incorrecta
        Bonifica con 10 cada letra correcta
        limite - frontera
        en 0 unidades puntaje total
        10 incorrectas - 0 correctas

        numero de desaciertos*10 + numero correctas = 0
     */
    @Test
    public void validateBonusScore1(){
        BonusScore bonusScore = new BonusScore();
        int score = bonusScore.calculateScore(0,10);
        Assert.assertEquals(score,0);
    }
    /**Clase de equivalencia 2 BonusScore
        penalizar unicamente con 5 unidades por letra incorrecta
        Bonifica con 10 cada letra correcta
        limite - frontera
        numero aciertos*2 = numero desaciertos
     */
     @Test
    public void validateBonusScore2(){
        BonusScore bonusScore = new BonusScore();
        int score = bonusScore.calculateScore(3,6);
        Assert.assertEquals(score,0);
    }

    /**Clase de equivalencia 3 BonusScore
        penalizar unicamente con 5 unidades por letra incorrecta
        Bonifica con 10 cada letra correcta
        limite - frontera
        numero aciertos > num de desaciertos/2
     */
     @Test
    public void validateBonusScore3(){
        BonusScore bonusScore = new BonusScore();
        int score = bonusScore.calculateScore(4,6);
        Assert.assertEquals(score,10);
    }


    
    /**Clase de equivalencia 3 PowerBonusScore
        penalizar unicamente con 8 unidades por letra incorrecta
        la iésima letra correcta se bonifica con 5^i
        puntaje minimo 0
        limite - frontera

        numero de desaciertos>0 & numero aciertos= 0
     */
    @Test
    public void validatePowerBonusScore1(){
        PowerBonusScore powerBonusScore = new PowerBonusScore();
        int score = powerBonusScore.calculateScore(0,10);
        Assert.assertEquals(score,0);

    }/**Clase de equivalencia 3 PowerBonusScore
        penalizar unicamente con 8 unidades por letra incorrecta
        la iésima letra correcta se bonifica con 5^i
        puntaje minimo 0
        limite - frontera

        numero de aciertos<=4 & numero desaciertos 27-numaciertos
     */
    @Test
    public void validatePowerBonusScore2(){
        PowerBonusScore powerBonusScore = new PowerBonusScore();
        int score = powerBonusScore.calculateScore(4,23);
        Assert.assertEquals(score,441);
    }

    /**Clase de equivalencia 3 PowerBonusScore
        penalizar unicamente con 8 unidades por letra incorrecta
        Bonifica con 5^i cada letra correcta
        limite - frontera
        numero aciertos > 4 
     */
    @Test
    public void validatePowerBonusScore3(){
        PowerBonusScore powerBonusScore = new PowerBonusScore();
        int score = powerBonusScore.calculateScore(5,22);
        Assert.assertEquals(score,500);
    }

}










