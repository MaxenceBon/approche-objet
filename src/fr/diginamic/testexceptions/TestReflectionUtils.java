package fr.diginamic.testexceptions;



public class TestReflectionUtils {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, ReflectionException {
		// TODO Auto-generated method stub
		try {
			ReflectionUtils.afficherAttributs(null);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ReflectionException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	}

}
