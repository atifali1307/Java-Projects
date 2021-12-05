<html>
<head>
  <meta charset="UTF-8">
  <title>Fire Animation</title>
  <link rel="stylesheet" href="css/index1.css">
</head>
<body>
  <div class="text">
    <h2>AAK STORE</h2>
  </div>
  <svg>
    <filter id="fire">
      <feTurbulence id="turbulence" baseFrequency="0.1 0.1" numOctave="2" seed="3">
        <animate attributeName="baseFrequency" dur="10s" values="0.1 0.1;0.12 0.2" repeatCount="indefinite"></animate>
      </feTurbulence>
       <feDisplacementMap in="SourceGraphic" scale="25"></feDisplacement>
    </filter>
  </svg>
  <button style="width: 95; height: 30; background: transparent;border: transparent"><span style="font-size: 20; font-weight: bold;color: white;"><a href="index.jsp">Proceed</a></span></button>
</body>
</html>