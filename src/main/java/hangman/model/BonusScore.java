package hangman.model;
public class BonusScore implements GameScore{
	private int initialValue;

	public BonusScore(){
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
		if ((incorrectCount >= correctCount*2)||(correctCount ==0 && incorrectCount >= 0) ){
			this.initialValue=0;
		}else{
			this.initialValue+=((correctCount*10)-incorrectCount*5);
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