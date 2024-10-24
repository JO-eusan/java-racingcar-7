package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

	private String name;
	private int moveCounter;

	public String getName() {
		return name;
	}

	public int getMoveCounter() {
		return moveCounter;
	}

	public Car(String name) throws IllegalArgumentException {

		validateName(name);

		this.name = name;
		this.moveCounter = 0;
	}

	private void validateName(String name) throws IllegalArgumentException {

		String trimmedName = name.trim();

		if (trimmedName.length() > 5) {
			throw new IllegalArgumentException("차량의 이름은 5자 이하만 가능합니다.");
		}
	}

	public int move() {

		int randomValue = Randoms.pickNumberInRange(0, 9);

		if (randomValue >= 4) {
			moveCounter++;
		}

		return moveCounter;
	}
}
