package org.tnsindia.di1;

public class Student {
	
	MathCheat math;
	
	public void cheating()
	{
		math.mathCheat();
	}

	//DI using Setters

	public void setMath(MathCheat math) {
		this.math = math;
	}

}
