package net.sunj.learning.tutorials.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamExample1 {

  public static void main(String[] args) {
    Arrays.asList(1, 2, 3).stream(); // (1)
    Arrays.asList(1, 2, 3).parallelStream(); // (2)

    // stream의 요소를 순회해야 한다면 forEach를 활용할 수 있습니다.
    System.out.println("forEach : ");
    Arrays.asList(1, 2, 3).stream().forEach(System.out::println); // 1,2,3
    
    System.out.println("forEach parallelStream : ");
    Arrays.asList(1, 2, 3).stream().forEach(System.out::println); // 1,2,3

    // map : stream의 개별 요소마다 연산을 할 수 있습니다. 아래의 코드는 리스트에 있는 요소의 제곱 연산을 합니다.
    System.out.println("map : ");
    Arrays.asList(1, 2, 3).stream().map(i -> i * i).forEach(System.out::println); // 1,4,9

    // limit : stream의 최초 요소부터 선언한 인덱스까지의 요소를 추출해 새로운 stream을 만듭니다.
    System.out.println("limit : ");
    Arrays.asList(1, 2, 3).stream().limit(1).forEach(System.out::println); // 1

    // skip : stream의 최초 요소로부터 선언한 인덱스까지의 요소를 제외하고 새로운 stream을 만듭니다.
    System.out.println("skip : ");
    Arrays.asList(1, 2, 3).stream().skip(1).forEach(System.out::println); // 2,3

    // filter : stream의 최초 요소부터 선언한 인덱스까지의 요소를 추출해 새로운 stream을 만듭니다.
    System.out.println("filter : ");
    Arrays.asList(1, 2, 3).stream().filter(i -> 2 >= i).forEach(System.out::println); // 1,2

    // flatMap : stream의 내부에 있는 객체들을 연결한 stream을 반환합니다.
    System.out.println("flatMap : ");
    Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4, 5), Arrays.asList(6, 7, 8, 9)).stream()
        .flatMap(i -> i.stream()).forEach(System.out::println); // 1,2,3,4,5,6,7,8,9

    // reduce : stream을 단일 요소로 반환합니다.
    // 이 코드는 조금 설명이 필요할 것 같습니다.
    // 우선, 첫번째 연산으로 1과 2가 선택되고 계산식은 앞의 값에서 뒤의 값을 빼는 것이기 때문에 결과는 -1이 됩니다.
    // 그리고 이상태에서 -1과 3이 선택되고 계산식에 의해 -1-3이 되기 때문에 결과로 -4가 나옵니다.
    // 뒤로 추가 요소가 있다면 차근차근 앞에서부터 차례대로 계산식에 맞춰 계산하면 됩니다.
    System.out.println("reduce : ");
    Arrays.asList(1, 2, 3).stream().reduce((a, b) -> a - b).get(); // -4

    // collection : 아래의 코드들은 각각의 메소드로 콜렉션 객체를 만들어서 반환합니다.
    System.out.println("collection : ");
    Arrays.asList(1, 2, 3).stream().collect(Collectors.toList());
    Arrays.asList(1, 2, 3).stream().iterator();
  }

}
