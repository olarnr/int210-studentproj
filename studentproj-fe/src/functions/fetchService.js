export async function getService(url) {
    try {
      let response = await fetch(url, {mode:'cors'})
      let responseBody = await response.json()
      if (response.ok) {
        return {"body": responseBody, "code": response.status}
      } else {
	      return {"body": "ERROR: " + response.status + " " + responseBody.message, "code": response.status}
      }
    } catch (error) {
        return {"body": "ERROR: Can not connect to " + url, "code": 500}
    }
  }
