package hangman.model;
public class OriginalScore implements GameScore{
	private int initialValue;
	public OriginalScore(){
		this.initialValue =100;
	}
	/**
	@pre ninguna 
	@pos retorna el puntaje que acumula el jugador
	@param correctCount: numero de aciertos 
	@param incorrectCount: numero de desaciertos
	@throws 
	**/
	public int calculateScore(int correctCount, int incorrectCount){
		if (incorrectCount>9) {
			return 0;
		}else{
			return (initialValue-incorrectCount*(10));
		}
	}
	
	public int setInitialValue(){
		return this.initialValue;
	}

	public int resetInitialValue(){
		this.initialValue=100;
		return this.initialValue;
	}
}