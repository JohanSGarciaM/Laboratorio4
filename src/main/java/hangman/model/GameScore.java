package hangman.model;
public interface GameScore{
	public int calculateScore(int correctCount, int incorrectCount);
	public int setInitialValue();
	public int resetInitialValue();
}