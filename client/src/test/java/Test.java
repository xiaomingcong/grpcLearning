import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        String str = "sdf";
        System.out.println(str.substring(0,str.length() - 1));
        new StringBuffer().reverse().toString();
    }

    public static TrieTree prefixRoot = new TrieTree();
    public static TrieTree suffixRoot = new TrieTree();

    public static void WordFilter(String[] words) {
        buildTree(words);
    }

    public static int f(String pref, String suff) {
        return 1;
    }

    public static void buildTree(String[] words){
        for(String word : words){
            buildPrefix(prefixRoot,word);
            buildSuffix(suffixRoot,word);
        }

    }

    public static void buildPrefix(TrieTree node,String word){
        int length = word.length();
        char ch = word.charAt(0);
        TrieTree tree = node.map.get(ch);
        if(tree == null){
            tree = new TrieTree();
            node.map.put(ch,tree);
        }
        if(length == 1){
            tree.isWord = true;
            return;
        }
        buildPrefix(tree,word.substring(1));
    }

    public static void buildSuffix(TrieTree node,String word){
        int length = word.length();
        char ch = word.charAt(length - 1);
        TrieTree tree = node.map.get(ch);
        if(tree == null){
            tree = new TrieTree();
            node.map.put(ch,tree);
        }
        if(length == 1){
            tree.isWord = true;
            return;
        }
        buildPrefix(tree,word.substring(0,length - 1));
    }


    static class TrieTree{
        public Map<Character,TrieTree> map = new HashMap<>();
        public boolean isWord;
        public int maxLength;
    }
}
