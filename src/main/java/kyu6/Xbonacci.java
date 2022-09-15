package kyu6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {
        if (n == 0) return new double[]{};
        List<Double> result = new ArrayList();
        result.addAll(DoubleStream.of(s).boxed().collect(Collectors.toList()));

        for (int i = 2; i < n-1; i++) {
            double newValue = result.get(i-2) + result.get(i-1) + result.get(i);
            result.add(newValue);
        }
        double[] resultArray = new double[n];
        for (int i = 0; i < n; i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
}