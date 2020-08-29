package hangman.model;
public class BonusScore implements GameScore{
	private int incorrectCount;
	private int correctCount;
	/**
	@pre ninguna 
	@pos retorna el puntaje que acumula el jugador
	@param correctCount: numero de aciertos 
	@param incorrectCount: numero de desaciertos
	@throws ..
	**/
	public int calculateScore(int correctCount, int incorrectCount){
		return 0;
	}

	public int setInitialValue(){
		return 0;
	}
}