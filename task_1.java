@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	assertEquals("Показать ошибку при значении false", true, isAdult);// Напиши код здесь
}

