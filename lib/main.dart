import "package:flutter/material.dart";

void main() {
  runApp(RTCApp());
}

class RTCApp extends StatefulWidget {
  @override
  State<StatefulWidget> createState() {
    return RTCAppState();
  }
}

class RTCAppState extends State<RTCApp> {
  var questionIndex = 0;

  void answerQuestion() {
    setState(() {
      if (questionIndex == 1)
        questionIndex = 0;
      else if (questionIndex == 0) questionIndex = 1;
      print("Answer chosen");
    });
  }

  @override
  Widget build(BuildContext context) {
    var question = [
      "What is your name?",
      "What is your age?",
    ];
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text("Hello Title!"),
        ),
        body: Column(
          children: [
            Text(question[questionIndex]),
            ElevatedButton(
              child: Text("Answer 1"),
              onPressed: answerQuestion,
            ),
            ElevatedButton(
              child: Text("Answer 2"),
              onPressed: answerQuestion,
            ),
            ElevatedButton(
              child: Text("Answer 3"),
              onPressed: answerQuestion,
            )
          ],
        ),
      ),
    );
  }
}
