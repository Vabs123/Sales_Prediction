import java.io.BufferedReader;
import java.io.FileReader;
import weka.core.Instance;
import weka.core.Instances;
import weka.classifiers.functions.LinearRegression;
import weka.classifiers.Classifier;
import weka.core.converters.ConverterUtils.DataSource;
import java.util.Random;
import weka.classifiers.Evaluation;

class LearnModel{
	public static void main(String args[]) throws Exception{
	Classifier model = (Classifier)new LinearRegression();
	DataSource source = new DataSource("final.csv");
	Instances data = source.getDataSet();
	data.setClassIndex(3);
	System.out.println(data.classAttribute());

	Evaluation eval = new Evaluation(data);
 	eval.crossValidateModel(model, data, 100, new Random(1));
 	String strSummary = eval.toSummaryString();
 	System.out.println(strSummary);
	}
}