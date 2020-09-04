package hangman.model;
import java.lang.Math.*;
public class PowerBonusScore implements GameScore{

	private int initialValue;
	public PowerBonusScore(){
		this.initialValue=0;
	}
	/**
	@pre ninguna 
	@pos retorna el puntaje que acumula el jugador
	@param correctCount: numero de aciertos 
	@param incorrectCount: numero de desaciertos
	@throws ..
	**/
	public int calculateScore(int correctCount, int incorrectCount){
		if(correctCount>4){
			this.initialValue=500;
		}else if((correctCount == 0) && (incorrectCount>0)){
			this.initialValue=0;
		}else{
			this.initialValue+=(int)Math.pow(5,correctCount)-8*incorrectCount;
		}
		return this.initialValue;
	}
	public int setInitialValue(){
		return 0;
	}
	public int resetInitialValue(){
		this.initialValue=0;
		return this.initialValue;
	}
}