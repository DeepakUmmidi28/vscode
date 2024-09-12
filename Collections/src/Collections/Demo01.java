package Collections;
import java.util.Iterator;

class Demo01<T> implements Iterable<T>
{
   public T[] list ;
   int size;
@SuppressWarnings("unchecked")
Demo01()
   {
        size=0;
        list=(T[])new Object[100];
   }

   public void AddItem(T item)
   {
        list[size++]=item;
        //size++;
   }
   public T getItemAtIndex(int index)
   {
        return list[index];
   }

@Override
public Iterator<T> iterator() {
   //   OurGenericListIterator ins=new OurGenericListIterator(this);
   //   return ins;
    return new OurGenericListIterator<T>(this);
   //return new OurGenericListIterator(new Demo01());
}
}

class OurGenericListIterator<T> implements Iterator<T>
{
   private Demo01<T> d;
    int index=0;

   public OurGenericListIterator(Demo01<T> d)
   {
      this.d=d;
   }
   @Override
   public boolean hasNext() {
      return index < d.size;
   }

   @Override
   public T next() throws NullPointerException {
      // T item =d.list[index];
      // index++;
      // return item;
      //System.out.println("next Called");
      return d.list[index++];
   }
   
}

class Test
{
    public static void main(String[] args) {
      
      
         Demo01<Integer> d1=new Demo01<>();
         // OurGenericListIterator<Integer> o=new OurGenericListIterator<>(d1);
        // System.out.println(d1.size);
      //   System.out.println("Index :"+o.index);
          d1.AddItem(100);
          d1.AddItem(200);
          d1.AddItem(4000);
          d1.AddItem(500);

         // System.out.println(e);
         // System.out.println(d1.size);
        // d1.AddItem(2);
         Iterator<Integer> iterator=d1.iterator();
         while (iterator.hasNext()) {
         System.out.println(iterator.next());
         } 

         for(int x:d1)
         {
            System.out.println("For :"+x);
         }
         // System.out.println("Index :"+o.index);
         // System.out.println(iterator.hasNext());
         // System.out.println(d1.size);

      // Stack<Integer> s=new Stack<>();
      // s.push(10);
      // s.push(20);
      // Iterator<Integer> i1=s.iterator();
      // while(i1.hasNext())
      // {
      //    System.out.println(i1.next());
      // }
    }
}