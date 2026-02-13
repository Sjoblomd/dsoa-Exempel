public class Linky {
    Node first;
    Node last;

    private class Node{
        private Person person;
        private Node next;

        Node(Person person,Node node){
            this.person = person;
            this.next = node;
        }
        public String getPersonName(Person person){
            return person.getName();
        }

    }


    public void add (Person person){
        Node n = new Node(person,null);
        if(first == null) first = n;
        if(last != null) last.next = n;
        last = n;
    }

    public int size(){
        Node current = first;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    @Override
    public String toString(){
        String ret = "";
        Node current = first;

        while(current != null){
            ret += " " + current.person.getName();
            current = current.next;
        }

        return ret;
    }
}
