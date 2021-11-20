package aula0810;

import java.util.Random;

public class Exercicio1 {

	public static int vetor[] = new int[100];
	public static int vetorisertion[] = new int[100];
	public static int QuickSortvetor[] = new int[100];
	public static int SelectionSort[] = new int[100];
	public static int mergeSort[] = new int[100];
	public static int ordena;
	public static int metodo;
	public static Random random = new Random(100);

	public static void main(String[] args) throws Exception {
		vetor();
		copia();
		bubbleSort();
		vetorinsertion();
		QuickSort(QuickSortvetor);
		SelectionSort();
		MergeSort(mergeSort);
	}
	private static void MergeSort(int[] mergeSort) {
        ordena = 0;
        metodo = 0;
        int tamanho = mergeSort.length;
        int elementos = 1;
        int inicio, meio, fim;

        while (elementos < tamanho) {
            inicio = 0;
            ordena++;

            while (inicio + elementos < tamanho) {
                metodo++;
                meio = inicio + elementos;
                fim = inicio + 2 * elementos;

                if (fim > tamanho) {
                    fim = tamanho;
                }

                Intercala(mergeSort, inicio, meio, fim);
                inicio = fim;
            }
            elementos = elementos * 2;
        }

        String nome = "MergeSort";
    	System.out.println("");
        System.out.println("MergeSort");
        lermargeSort(mergeSort, nome);
    }

    private static void lermargeSort(int[] mergeSort, String nome) {
    	for (int i = 0; i  < SelectionSort.length; i++) {
			System.out.print(SelectionSort[i] + " ");
			}
		
		System.out.println(" ");
		System.out.println("ordenação: " + ordena);
		System.out.println("Métodos: " + metodo);
		}
		
	private static void Intercala(int[] mergeSort, int inicio, int meio, int fim) {
        int novoVetor[] = new int[fim - inicio];
        int i = inicio;
        int m = meio;
        int pos = 0;

        while (i < meio && m < fim) {
            if (mergeSort[i] <= mergeSort[m]) {
                novoVetor[pos] = mergeSort[i];
                pos = pos + 1;
                i = i + 1;
                ordena++;
            } else {
                novoVetor[pos] = mergeSort[m];
                pos = pos + 1;
                m = m + 1;
                ordena++;
            }
        }
        while (i < meio) {
            novoVetor[pos] = mergeSort[i];
            pos = pos + 1;
            i = i + 1;
            ordena++;
        }
        while (m < fim) {
            novoVetor[pos] = mergeSort[m];
            pos = pos + 1;
            m = m + 1;
            ordena++;
        }
        for (pos = 0, i = inicio; i < fim; i++, pos++) {
        	mergeSort[i] = novoVetor[pos];
        }
    }
    
	private static void SelectionSort() {
		int ordena = 0;
		int metodo = 0;
			for (int fixo = 0; fixo < SelectionSort.length - 1; fixo++) {
				ordena++;
				int menor = fixo;
				for(int i = menor + 1; i < SelectionSort.length; i++) {
					if (SelectionSort[i] < SelectionSort[menor]) {
						menor = i;
					}
				}
				if(menor != fixo) {
					metodo++;
					int t = SelectionSort[fixo];
					SelectionSort[fixo] = SelectionSort[menor];
					SelectionSort[menor] = t;
				}
			}
			System.out.println("");
			System.out.println("Selection Sort");
			lerselection();
			System.out.println("ordenação: " + ordena);
			System.out.println("Métodos: " + metodo);
		}
	private static void lerselection() {
		for (int i = 0; i  < SelectionSort.length; i++) {
			System.out.print(SelectionSort[i] + " ");
			}
		System.out.println(" ");
	
		}

	private static void QuickSort(int[] QuickSortvetor) {
        int inicio = 0;
        int fim = QuickSortvetor.length - 1;
        String nome = "QuickSort";
        ordena = 0;
        metodo = 0;
        QuickSort1(QuickSortvetor, inicio, fim);
    	System.out.println("");
        System.out.println("Quick Sort");
        ler3(QuickSortvetor, nome);
    }
	private static void  ler3(int[] QuickSortvetor, String nome) {
		for (int i = 0; i  < QuickSortvetor.length; i++) {
			System.out.print(QuickSortvetor[i] + " ");
			}
		System.out.println(" ");
		System.out.println("ordenação: " + ordena);
		System.out.println("Métodos: " + metodo);
		}
    private static void QuickSort1(int[] QuickSortvetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = Separar(QuickSortvetor, inicio, fim);
            QuickSort1(QuickSortvetor, inicio, posicaoPivo - 1);
            QuickSort1(QuickSortvetor, posicaoPivo + 1, fim);
            // ordena++;
            // 5
        }
    }
    private static int Separar(int[] QuickSortvetor, int inicio, int fim) {
        int pivo = QuickSortvetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            metodo++;
            if (QuickSortvetor[i] <= pivo) {
                i++;
                ordena++;
                // 4
            } else if (pivo < QuickSortvetor[f]) {
                f--;
                ordena++;
                // 5
            } else {
                int troca = QuickSortvetor[i];
                QuickSortvetor[i] = QuickSortvetor[f];
                QuickSortvetor[f] = troca;
                i++;
                f--;
                ordena--;
                // 3
            }
        }
        QuickSortvetor[inicio] = QuickSortvetor[f];
        QuickSortvetor[f] = pivo;
        // ordena++;
        // 5
        return f;
    }
	
	private static void lerInsertion() {
		for (int i = 0; i  < vetorisertion.length; i++) {
			System.out.print(vetorisertion[i] + " ");
			}
		System.out.println(" ");
		}
	private static void vetorinsertion() {
		int ordenacao = 0;
		int metodo = 0;
		int j;
		int key;
		int i;
		for(j = 1; j < vetorisertion.length ; j++) {
			metodo++;
			key = vetorisertion[j];
		for(i = j - 1; (i >= 0) && (vetorisertion[i] > key); i--) {
			vetorisertion[i + 1] = vetorisertion[i];
			ordenacao++;
		}
		vetorisertion[i + 1] = key;
		}
		System.out.println("");
		System.out.println("Insertion ");
		lerInsertion();
		System.out.println("Ordenação:" + ordenacao);
		System.out.println("Métodos:" + metodo);
		
	} 
	public static void copia() {
		for (int i = 0; i < vetor.length; i++)
		{
			vetorisertion[i] = vetor[i];
			QuickSortvetor[i] = vetor[i];
			SelectionSort[i] = vetor[i];
			mergeSort[i] = vetor[i];
		}
	}
		
	public static void vetor() {
		for (int i = 0; i  < vetor.length; i++) {
		vetor[i] = random.nextInt(100);
		}
		System.out.println("Random");
		ler();
		System.out.println("");
		System.out.println("Bubble Sort");
	}
	public static void ler() {
		for (int i = 0; i  < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
			}
		System.out.println(" ");
		}
	public static void bubbleSort() {
		boolean troca = true;
		int aux;
		int vezes = 0;
		int vezes2 = 0;
		while(troca) {
			vezes2++;
			troca = false;
			
			for (int i = 0; i  < vetor.length - 1; i++) {
				if(vetor[i] > vetor[i + 1]) {
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux; 
					vezes++;
					troca = true;
				}
			}
		}
		ler();
		System.out.println("Ordenação:" + vezes);
		System.out.println("Métodos:" + vezes2);
	}
	
}



