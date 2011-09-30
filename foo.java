import edu.stanford.nlp.pipeline.*;
import java.io.*;
import java.util.*;

public class foo {
 public static void main(String[] args) {
	Properties props = new Properties();
    props.put("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref");
    StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
   PrintWriter out = new PrintWriter(System.out);
   //StanfordCoreNLP pipeline = new StanfordCoreNLP();
   Annotation annotation = new Annotation("Kosgi Santosh sent an email to Stanford University");
   pipeline.annotate(annotation);
   pipeline.prettyPrint(annotation, out);


 
 }
}