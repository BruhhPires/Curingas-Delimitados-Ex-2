package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(1,2,3,4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<>();
		
		copy(myInts, myObjs); // COPIAR O MYINTS PRO OBJETO
		printList(myObjs);
		copy(myDoubles, myObjs); // COPIARO MYDOUBLES PRO OBJETO
		printList(myObjs);
	}

	public static void copy(List<? extends Number> source, List<? super Number> destiny) { 
// O METODO COPY, RECEBE A LISTA DE QUALQUER TIPO QUE EXTENDES NUMBER(ORIGEM) -- COVARIANCIA
//E A LISTA DE DESTINY É UMA LISTA DE QUALQUER TIPO QUE PODE SER UM SUPER TIPO DE NUMBER -- CONTRAVARIANCIA
		for (Number number: source) { // PRA CADA NUMBER number NA LISTA source
			destiny.add(number); // ADCIONA UM ITEM NUMBER DO DESTINO
		}
	}
	public static void printList(List<?> list) {
		for(Object obj: list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}

}
