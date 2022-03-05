var $btn = document.querySelector('.btn');
//alert("warning");
$btn.addEventListener('click', e => {
  window.requestAnimationFrame(() => {
    $btn.classList.remove('is-animating');
    
    window.requestAnimationFrame(() => {
      $btn.classList.add('is-animating');
    });
  });
});
