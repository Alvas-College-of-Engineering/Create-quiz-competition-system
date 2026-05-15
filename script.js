const questions = [

    {
        question: "Which language is used for Android Development?",
        options: ["Python", "Java", "PHP", "C"],
        answer: "Java"
    },

    {
        question: "Who developed Java?",
        options: ["Google", "Sun Microsystems", "Apple", "Microsoft"],
        answer: "Sun Microsystems"
    },

    {
        question: "Which keyword is used for inheritance in Java?",
        options: ["this", "extends", "final", "static"],
        answer: "extends"
    }

];

let currentQuestion = 0;
let score = 0;
let username = "";

function startQuiz() {

    username = document.getElementById("name").value;

    if (username == "") {
        alert("Please Enter Name");
        return;
    }

    document.getElementById("start-screen").classList.add("hidden");
    document.getElementById("quiz-box").classList.remove("hidden");

    loadQuestion();
}

function loadQuestion() {

    let q = questions[currentQuestion];

    document.getElementById("question").innerText = q.question;

    let buttons = document.querySelectorAll(".option");

    buttons.forEach((btn, index) => {
        btn.innerText = q.options[index];
        btn.disabled = false;
        btn.style.background = "#f1f1f1";
    });
}

function checkAnswer(button) {

    let selected = button.innerText;

    if (selected == questions[currentQuestion].answer) {

        score++;
        button.style.background = "green";

    } else {

        button.style.background = "red";
    }

    let buttons = document.querySelectorAll(".option");

    buttons.forEach(btn => {
        btn.disabled = true;
    });
}

function nextQuestion() {

    currentQuestion++;

    if (currentQuestion < questions.length) {

        loadQuestion();

    } else {

        showResult();
    }
}

function showResult() {

    document.getElementById("quiz-box").classList.add("hidden");

    document.getElementById("result-box").classList.remove("hidden");

    document.getElementById("result").innerHTML =
        username + ", Your Score is " + score + "/" + questions.length;
}
