
public class OperatiiSiruri {
	
	private Sorter sorter;
	
	public OperatiiSiruri(Sorter s)
    {
        sorter = s;
    }
	
	public int[] interclasare(int[] a, int[] b)
	{
		a = sorter.sort(a);
		b = sorter.sort(b);
		int n = a.length+b.length;
		int[] c = new int[n];
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length){
			if(a[i]<b[j]){
				c[k] = a[i];
				k++;
				i++;
			}
			else
				if(b[j]<a[i]){
					c[k]=b[j];
					j++;
					k++;
				}
				else
				{
					c[k] = a[i];
					i++;
					j++;
					k++;
				}
		}
		while(i<a.length){
			c[k] = a[i];
			i++;
			k++;
		}
		while(j<b.length){
			c[k] = b[j];
			j++;
			k++;
		}
		return c;
		
	}
}
