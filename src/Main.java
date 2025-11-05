public class Main {
    public static void main(String[] args) {
        ArrayStack<String> name = new ArrayStack<>();
        name.push("jaabir");
        name.push("faadumo");
        name.push("ayaan");
        name.push("maxamed");
        name.pop();
        name.display();
        System.out.println("Size =  "+ +name.size());
        System.out.println("Read last Elemrnt "+name.peek());
        System.out.println("Search the element  = " + name.search(""));
    }


}