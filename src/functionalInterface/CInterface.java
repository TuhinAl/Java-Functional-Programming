package functionalInterface;

import collections.BInterface;

public interface CInterface extends AInterFace, BInterface{

	public void CInterfaceMethod();

	@Override
	default void defaultMethod() {
		// TODO Auto-generated method stub
		AInterFace.super.defaultMethod();
//		BInterface.super.defaultMethod();
	}
}
