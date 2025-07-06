const App = () => {
  const [code, setCode] = React.useState('');
  const [result, setResult] = React.useState(null);
  const handleSubmit = async (e) => {
    e.preventDefault();
    if (!code) return;
    try {
      const res = await fetch(`/api/code/${code}`);
      if (res.ok) {
        const data = await res.json();
        setResult(data.status);
      } else {
        setResult('Not found');
      }
    } catch (err) {
      setResult('Error');
    }
  };
  return (
    <div>
      <h1>Halal Check</h1>
      <form onSubmit={handleSubmit}>
        <input value={code} onChange={e => setCode(e.target.value)} placeholder="Food Code" />
        <button type="submit">Check</button>
      </form>
      {result && <p>Result: {result}</p>}
    </div>
  );
};
ReactDOM.render(<App />, document.getElementById('root'));
