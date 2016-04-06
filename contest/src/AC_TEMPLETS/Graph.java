//package AC_TEMPLETS;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.Iterator;
//import java.util.NoSuchElementException;
//import java.util.Stack;
//import java.util.StringTokenizer;
//
///**
// * Created by htplex on 4/6/16.
// */
//
//public class Graph {
//
//  private int V;
//  private int E;
//  private Bag<Integer>[] adj;
//
//  public Graph(int V) {
//    if (V < 0) throw new IllegalArgumentException("Number of vertices must be nonnegative");
//    this.V = V;
//    this.E = 0;
//    adj = (Bag<Integer>[]) new Bag[V];
//    for (int v = 0; v < V; v++) {
//      adj[v] = new Bag<Integer>();
//    }
//  }
//
//  public Graph(inputReader in) {
//    this(in.readInt());
//    int E = in.readInt();
//    if (E < 0) throw new IllegalArgumentException("-1");
//    for (int i = 0; i < E; i++) {
//      int v = in.readInt();
//      int w = in.readInt();
//      addEdge(v, w);
//    }
//  }
//
//  public Graph() {
//    this(G.V());
//    this.E = G.E();
//    for (int v = 0; v < G.V(); v++) {
//      Stack<Integer> reverse = new Stack<Integer>();
//      for (int w : G.adj[v]) {
//        reverse.push(w);
//      }
//      for (int w : reverse) {
//        adj[v].add(w);
//      }
//    }
//  }
//
//  public int V() {
//    return V;
//  }
//
//  public int E() {
//    return E;
//  }
//
//  public void addEdge(int v, int w) {
//    if (v < 0 || v >= V) throw new IndexOutOfBoundsException();
//    if (w < 0 || w >= V) throw new IndexOutOfBoundsException();
//    E++;
//    adj[v].add(w);
//    adj[w].add(v);
//  }
//
//  public Iterable<Integer> adj(int v) {
//    if (v < 0 || v >= V) throw new IndexOutOfBoundsException();
//    return adj[v];
//  }
//
//  public String toString() {
//    StringBuilder s = new StringBuilder();
//    String NEWLINE = System.getProperty("line.separator");
//    s.append(V + " vertices, " + E + " edges " + NEWLINE);
//    for (int v = 0; v < V; v++) {
//      s.append(v + ": ");
//      for (int w : adj[v]) {
//        s.append(w + " ");
//      }
//      s.append(NEWLINE);
//    }
//    return s.toString();
//  }
//
//  public static void main(String[] args) {
//    Graph graph=new Graph();
//  }
//
//}
//
//
//class Bag<Item> implements Iterable<Item> {
//  private int N;               // number of elements in bag
//  private Node<Item> first;    // beginning of bag
//
//  // helper linked list class
//  private static class Node<Item> {
//    private Item item;
//    private Node<Item> next;
//  }
//  public Bag() {
//    first = null;
//    N = 0;
//  }
//  public boolean isEmpty() {
//    return first == null;
//  }
//  public int size() {
//    return N;
//  }
//
//  public void add(Item item) {
//    Node<Item> oldfirst = first;
//    first = new Node<Item>();
//    first.item = item;
//    first.next = oldfirst;
//    N++;
//  }
//
//  public Iterator<Item> iterator()  {
//    return new ListIterator<Item>(first);
//  }
//  private class ListIterator<Item> implements Iterator<Item> {
//    private Node<Item> current;
//
//    public ListIterator(Node<Item> first) {
//      current = first;
//    }
//
//    public boolean hasNext()  { return current != null;                     }
//    public void remove()      { throw new UnsupportedOperationException();  }
//
//    public Item next() {
//      if (!hasNext()) throw new NoSuchElementException();
//      Item item = current.item;
//      current = current.next;
//      return item;
//    }
//  }
//  static class InputReader {
//    public BufferedReader reader;
//    public StringTokenizer tokenizer;
//
//    public InputReader(InputStream stream) {
//      reader = new BufferedReader(new InputStreamReader(stream), 32768);
//      tokenizer = null;
//    }
//
//    public String next() {
//      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
//        try {
//          tokenizer = new StringTokenizer(reader.readLine());
//        } catch (IOException e) {
//          throw new RuntimeException(e);
//        }
//      }
//      return tokenizer.nextToken();
//    }
//
//    public int nextInt() {
//      return Integer.parseInt(next());
//    }
//  }
//}